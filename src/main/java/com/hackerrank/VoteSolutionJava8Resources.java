package hackerRank.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VoteSolutionJava8Resources {
  public static void main(String args[]) {
    String[] listaVotes = { "Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria","Farah", "Farah", "Ryan", "Veronica" };
    System.out.println(electionWinner(listaVotes));
  }

  static String electionWinner(String[] votes) {
    List<String> wordList = Arrays.asList(votes);

    //Counting Votes
    Map<String, Long> counted = wordList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    
    //Sorting by value
//    counted = counted.entrySet()
//        .stream()
//        .sorted(Map.Entry.<String, Long> comparingByValue().reversed())
//        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    
    Map<Long,List<String>> vote = counted.entrySet()
                                  .stream()
                                  .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
   

    //Sorting by Key which is the number of votes reversed = Desc
    vote = vote.entrySet().stream().sorted(Map.Entry.<Long, List<String>> comparingByKey().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    
    //Get the names more voted and sort alphabetically
    List<String> sortedNames = vote.entrySet().iterator().next().getValue().stream().sorted().collect(Collectors.toList());
    
    //return the last
    return sortedNames.get(sortedNames.size()-1);
  }

}
