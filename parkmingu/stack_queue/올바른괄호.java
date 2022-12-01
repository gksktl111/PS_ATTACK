package parkmingu.stack_queue;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        Stack<String> bracket = new Stack<>();
        String str = ")()(";
        String[] arr = str.split("");
        boolean answer = true;
        int add = 0;

        for(int i = 0; i < str.length(); i++){
            bracket.push(arr[i]);
        }
        
        System.out.println(bracket);

        while(!bracket.empty()){

            if(bracket.pop().equals("(")){
                add--;
            }
            else {
                add++;
            }

            if(add == -1){
                break;
            }
        }

        if(add != 0){
            answer = false;
        }

        System.out.println(answer);
    }
}
