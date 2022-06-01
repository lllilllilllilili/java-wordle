package utils;

import domain.state.AnswerGenerator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AnswerGeneratorImpl implements AnswerGenerator {

    private static final List<String> Answer = getAnswerWords();

    private static final String REFERENCE_DATE = "2021-06-19";

    private static List<String> getAnswerWords() {
        return List.of("cigar", "rebut", "sissy", "humph", "awake", "blush", "focal", "evade", "naval", "serve", "heath",
                       "dwarf", "model", "karma", "stink", "grade", "quiet", "bench", "abate", "feign", "major", "death",
                       "fresh", "crust", "stool", "colon", "abase", "marry", "react", "batty", "pride", "floss", "helix",
                       "croak", "staff", "paper", "unfed", "whelp", "trawl", "outdo", "adobe", "crazy", "sower", "repay",
                       "digit", "crate", "cluck", "spike", "mimic", "pound", "maxim", "linen", "unmet", "flesh", "booby",
                       "forth", "first", "stand", "belly", "ivory", "seedy", "print", "yearn", "drain", "bribe", "stout");
    }

    @Override
    public String run() {
        return Answer.get(findIndex());
    }

    private int findIndex() {
        LocalDate now = LocalDate.now();
        //2021-06-19 날짜로 파싱
        LocalDate referenceDay = LocalDate.parse(REFERENCE_DATE, DateTimeFormatter.ISO_LOCAL_DATE);
        //두 시간 사이의 간격을 초나 나노 초 단위
        Duration diff = Duration.between(now.atStartOfDay(), referenceDay.atStartOfDay());
        //날짜를 말하는구나
        long diffDays = Math.abs(diff.toDays());
        //정답은 매일 바뀌며 ((현재 날짜 - 2021년 6월 19일) % 배열의 크기) 번째의 단어이다.
        return (int) (diffDays % Answer.size());
    }
}
