class Solution {
    public boolean isValid(String s) {
        char[] stack =new char[s.length()];
        int top=-1;
      
        for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
            
            if(ch=='('){
                stack[++top]=')';
            }
            else if(ch=='{'){
                stack[++top]='}';
            }
            else if(ch=='['){
                stack[++top]=']';
            }
            else{
                if(top==-1||stack[top--]!=ch){
                return false;
                }
              
            }
        }

        return top==-1;
    }
}