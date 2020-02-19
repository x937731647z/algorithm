package com.zju.cst.algorithm_note;

import org.jetbrains.annotations.NotNull;
import sun.text.normalizer.CharacterIteratorWrapper;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @author wulixz
 * @date 2/9/20 : 4:43 PM
 * @introduction :
 */
public class HaffmanCompress {
    public static void main(String[] args) {
//        String str = "I like like like java";
        String str = "She said where you wanna go, how much you want risk";

        HaffmanCompress hfc = new HaffmanCompress();

        String res = hfc.compress(str);
        System.out.println("the original String is : ");
        System.out.println(str);
        System.out.println();
        System.out.println("the original Binary coding is : ");
        String Binary = hfc.toBinary(str);
        System.out.println(Binary);
        System.out.println("the length of original coding is ");
        int BinaryLen = Binary.length();
        System.out.println(BinaryLen);
        System.out.println();
        System.out.println("the coding of original String is : ");
        System.out.println(res);
        int resLen = res.length();
        System.out.println("the length of current coding is ");
        System.out.println(resLen);
        float compressibility = (float)(BinaryLen - resLen) / BinaryLen;
        System.out.println("so the compressibility is " +  compressibility * 100 +"%");

    }
    public String toBinary(String string){
        String Binary = "";
        char [ ]  chars = string.toCharArray();
        for (char c: chars
        ) {
            Binary += Integer.toBinaryString(c);
        }
        System.out.println(Binary);
        return Binary;
    }
    public String compress(String str){
        int str_len = str.length();
        String result = "";
        // 1. 统计每个字符出现的次数，从小到大 排序
        // I : 1  , j : 1 , v : 1 , a : 2, l : 3, i : 3, k : 3, ' ' : 4
        List<HaffmanCodeNode> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (char chr : str.toCharArray()){
            if (map.containsKey(chr)){
                int count = map.get(chr);
                count ++;
                map.put(chr,count);
            }else {
                map.put(chr,1);
            }
        }
        Set<Character> map_keySet = map.keySet();
        Iterator<Character>  it = map_keySet.iterator();
        while (it.hasNext()){
            char key = it.next();
            int value = map.get(key);
            list.add(new HaffmanCodeNode(key,value));
        }
        // 2. 构建 Haffman 树 ，并且找到每个字符的路径，左为 0 ，右 为 1
        Collections.sort(list);
//        System.out.println(list);
        HaffmanCodeNode haffmanTree = HaffmanBuild(list);
//        System.out.println(haffmanTree.left.value);
        // 3. 保存 每个字符对应的haffman路径结果，生成 最终编码结果
//        System.out.println("find each character and output the code");
        haffmanTree.preOrder(haffmanTree,"");
        Map<Character,String>  codeMapped = haffmanTree.codeMap;
        char[] charsArrays = str.toCharArray();
        for (char chr : charsArrays ){
            result += codeMapped.get(chr);
        }
        return result;
    }
    public HaffmanCodeNode HaffmanBuild(List<HaffmanCodeNode> list){
        while (list.size() > 1){
            HaffmanCodeNode left = list.get(0);
            HaffmanCodeNode right = list.get(1);
            HaffmanCodeNode parent = new HaffmanCodeNode(left.chr , left.value + right.value);
            parent.left = left;
            parent.right = right;
            list.remove(left);
            list.remove(right);
            list.add(parent);
            Collections.sort(list);
        }
        return list.get(0);
    }


}
class HaffmanCodeNode implements Comparable<HaffmanCodeNode>{
    int value ;
    char chr;
    HaffmanCodeNode left ;
    HaffmanCodeNode right;
    Map<Character,String> codeMap = new HashMap<>();

    HaffmanCodeNode(char chr, int value){
        this.value = value;
        this.chr = chr;
    }

    @Override
    public String toString() {
        return "Node{" +
                "chr=" + chr +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(@NotNull HaffmanCodeNode o) {
        return this.value - o.value;
    }

    public void preOrder(HaffmanCodeNode root,String string){
        if (root.left != null){
            this.preOrder(root.left,string +"0");
        }
        if (root.right != null){
            this.preOrder(root.right, string + "1");
        }
        if (root.left == null ){
            codeMap.put(root.chr,string);
//            System.out.println(root.chr + "  :  " + string);
        }
    }
}