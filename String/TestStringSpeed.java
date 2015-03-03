package com.com.teststring;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vova on 23.02.2015.
 */
public class TestStringSpeed {
    private static final String REGEX = "друг";
    private static final String INPUT = "Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.Умножать друг на друга можно только те матрицы, для которых число столбцов первого сомножителя равно числу строк второго сомножителя. Результатом умножения является матрица, у которой число строк равно числу строк первого сомножителя, а число столбцов совпадает с числом столбцов второго сомножителя.";
    private long startTime;
    private long endTime;

    public String checkReEXPSpeed() {
        this.startTime = System.currentTimeMillis();

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        System.out.println("lookingAt(): " + m.lookingAt());
        System.out.println("matches(): " + m.matches());
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number "+ count);
            System.out.println("start(): "+ m.start());
            System.out.println("end(): " + m.end());
        }
        this.endTime = System.currentTimeMillis();
        return "" + (this.endTime - this.startTime);
    }

    public String checkStringTokenizerSpeed() {
        this.startTime = System.currentTimeMillis();

        StringTokenizer st = new StringTokenizer(INPUT);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        this.endTime = System.currentTimeMillis();
        return "" + (this.endTime - this.startTime);
    }

    public String checkStringSplitSpeed() {

        this.startTime = System.currentTimeMillis();
        String[] parts = INPUT.split(REGEX);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        this.endTime = System.currentTimeMillis();
        return "" + (this.endTime - this.startTime);
    }

    public void sRun() {
        System.out.println("Speed  ReEXP:  " + checkReEXPSpeed());
        System.out.println("Speed  StringTokenizer:  " + checkStringTokenizerSpeed());
        System.out.println("Speed  StringSplit:  " + checkStringSplitSpeed());
    }


    public static void main(String[] args) {
        TestStringSpeed a = new TestStringSpeed();
        a.sRun();

    }

}
