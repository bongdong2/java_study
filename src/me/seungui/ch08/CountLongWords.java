package me.seungui.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {

    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        // for문을 사용해 길이가 12이상인 단어 수 구하기
        int cnt = 0;
        for(String w : words) {
            if(w.length() > 12) cnt++;
        }

        // 스트림을 사용
        long count = words.stream()
                .filter(w -> w.length() > 12)
                .count();

        // parallelStream을 사용하면 스트림 라이브러리에서 필터링과 카운팅을 병렬로 수행한다.
        long newCnt = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();
    }
}
