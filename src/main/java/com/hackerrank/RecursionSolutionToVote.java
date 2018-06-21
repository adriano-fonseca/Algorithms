package hackerRank.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RecursionSolutionToVote {
  public static void main(String args[]) {
    String[] listaVotes = { "Marcy","Marcy","Marcy","Veronica", "Victor", "Dave", "Ryan", "Maria", "Maria", "Farah","Farah","Ryan", "Veronica"};
    System.out.println(electionWinner(listaVotes));
  }

  static String electionWinner(String[] votes) {
    TreeMap<Float, List<String>> mapVotes = new TreeMap<Float, List<String>>();
    List<String> votesList = new ArrayList(Arrays.asList(votes));
    mapVotes = countVotes(votesList, 0, mapVotes);
    System.out.println(mapVotes);
    Map<Float, List<String>> reversedMap = new TreeMap(Collections.reverseOrder());
    reversedMap.putAll(mapVotes);
    System.out.println(reversedMap);
    List<String> winnerList = reversedMap.entrySet().iterator().next().getValue();
    Collections.sort(winnerList);
    return winnerList.get(winnerList.size()-1);
  }

  private static TreeMap<Float, List<String>> countVotes(List<String> votesList, int ind, TreeMap<Float, List<String>> mapVotes) {
    if (ind == votesList.size()) {
      return mapVotes;
    } else {
      String candidate = votesList.get(ind);
      Float nrVotes = getVotesFromCandidate(votesList, candidate);
      mapVotes = addVotesToMap(nrVotes, candidate, mapVotes);
      return countVotes(votesList, ind, mapVotes);
    }
  }

  private static TreeMap<Float, List<String>> addVotesToMap(Float nrVotes, String candidate, TreeMap<Float, List<String>> mapVotes) {
    if (mapVotes.containsKey(nrVotes)) {
      mapVotes.get(nrVotes).add(candidate);
    } else {
      List<String> candidateList = new ArrayList<String>();
      candidateList.add(candidate);
      mapVotes.put(nrVotes, candidateList);
    }
    return mapVotes;
  }

  private static Float getVotesFromCandidate(List<String> votesList, String candidateSearched) {
    Iterator<String> it = votesList.iterator();
    Float votes = 0F;

    while (it.hasNext()) {
      String candidate = it.next();
      if (candidateSearched.equalsIgnoreCase(candidate)) {
        votes++;
        it.remove();
      }
    }
    return votes;
  }

}
