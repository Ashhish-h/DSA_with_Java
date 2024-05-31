package backtracking;


// Find subset of a string using backtracking. No of subset a string can have is 2^n , where n is the length of the string.
// In find subsets there are two condition whether a character of a string wants to a part of sub string or not

public class FindSubsets {
    public static void findSubSets(String str, String ans, int index){
        //base Case
        if(index == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else { 
                System.out.println(ans );
            }
            return;
        }


        // Case 1 : if the choice is yes
        findSubSets(str, ans + str.charAt(index), index + 1);

        // Case 2 : if the choice is no
        findSubSets(str, ans, index + 1);

    }

    public static void main(String[] args){
        String str = "abc";
        findSubSets(str, "", 0);
    }
}
