package com.github.hanlp;

import com.hankcs.hanlp.tokenizer.NLPTokenizer;

/**
 * @author : Milo
 */
public class Test {
    public static void main(String[] args) {
        // 不用词典照样分词。
        long currentTime = System.currentTimeMillis();
        NLPTokenizer.ANALYZER.enableCustomDictionary(false);
        System.out.println(NLPTokenizer.segment("在我国，春季田间管理的重点是夏季粮油作物，主要是冬小麦和油菜，产量超过全年粮食产量的五分之一。"));
        // 使用用词典分词。
        NLPTokenizer.ANALYZER.enableCustomDictionary(true);
        System.out.println(NLPTokenizer.segment("在我国，春季田间管理的重点是夏季粮油作物，主要是冬小麦和油菜，产量超过全年粮食产量的五分之一。"));
        System.out.println(NLPTokenizer.analyze("我救的不是他，是多年前一个寒夜里，在篝火与烈酒中，想仗剑江湖的少年。").translateLabels());
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
