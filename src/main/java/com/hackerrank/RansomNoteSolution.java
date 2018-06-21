package hackerRank.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNoteSolution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	List<String> magazineList = Arrays.asList(magazine);
    	List<String> noteList = Arrays.asList(note);

        Map<String, Long> wordsInMagazine = magazineList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> wordsInNote = noteList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean isPossible = false;
        
        for(HashMap.Entry<String, Long> wordNote : wordsInNote.entrySet()){
        	isPossible = magazineHasTheWord(wordNote, wordsInMagazine);
        	if(!isPossible)
        		break;
        }
        
        if(!isPossible){
        	System.out.println("No");

        } else {
        	System.out.println("Yes");

        }
    }
    
    private static boolean magazineHasTheWord(Entry<String, Long> wordNote, Map<String, Long> wordsInMagazine) {
    	if(wordsInMagazine.containsKey(wordNote.getKey())){
    		Long magazineWords = wordsInMagazine.get(wordNote.getKey());

    		Long magazineCount = magazineWords-wordNote.getValue();
    		if(magazineCount >= 0){
        		wordsInMagazine.put(wordNote.getKey(), magazineCount);
        		return true;
    		}
    	}
    	return false;
	}

	private static void printItems(Map<String, Long> map) {
        for(HashMap.Entry<String, Long> entry : map.entrySet()){
          System.out.println("Word: "+entry.getKey()+" Times: "+entry.getValue());
        }
        
      }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] magazine = {"give", "me", "grand", "today", "night", "give"};
        String[] note = {"give", "one", "grand", "today", "give"};


        checkMagazine(magazine, note);

        scanner.close();
    }
}
