class Solution {
    //Newer Approach
    //T(C(N) and O(1))  S(C(N))==O(N) as it requires Dynamic Memory space in a const time 
    private List<List<Integer>> ans = new ArrayList<>();//output Decalre
    private List<Integer> t = new ArrayList<>();//T's ArrayList Declare
    private int k;//K Declare

    public List<List<Integer>> combinationSum3(int k, int n) {//Combination Sum Declare
        this.k = k;//k's val declare
        dfs(1, n);//Calling Dfs Method Declare
        return ans;//Printing output
    }

    private void dfs(int i, int s) {//dfs func Decalre
        if (s == 0) {//initializing s verfy
            if (t.size() == k) {ans.add(new ArrayList<>(t));}//Adding ArrayList's t Size
            return;//Printing
        }
        if (i > 9 || i > s || t.size() >= k) {return;}//Printing t's Size
        
        t.add(i);//Adding t 
        dfs(i + 1, s - i);//Shifting from left to Right 
        t.remove(t.size() - 1);//DeAlloc t's size
        dfs(i + 1, s);//Moving to Next Right Elem
    }
}
//Older Approach
//     private void dfs(int k, int n, int s, List<Integer> path, List<List<Integer>> out) {//Dfs Funct Declare
//     if (k == 0 && n == 0) {//adding OutPut's Path 
//       return;
//     }
//     if (k == 0 || n < 0)//Combination Set Verifying
//       return;

//     for (int i = s; i <= 9; ++i) {//iteratively Adding Path 
//       path.add(i);//
//       dfs(k - 1, n - i, i + 1, path, out);
//       path.remove(path.size() - 1);
//     }
//   }
//   public List<List<Integer>> combinationSum3(int k, int n) {
//     //Newer Approach
//     //T(C(N)) and S(C(N))==O(1) as it requires dynamic memory alloc iteravtively
//     List<List<Integer>> out = new ArrayList<>();//Output Declare
//     dfs(k, n, 1, new ArrayList<>(), out);//calling dfs func
//     return out;//printing Output
//   }
// }
  

// class Solution {
//     static void rec(int n,int k,int sum,List<Integer>ds,List<List<Integer>>out){
//         if(ds.size()==k && sum==n)out.add(new ArrayList<>());
//         return ;
//         int i=0;
//         if(sum>n || i>=0)return ;
//         ds.add(i);
//         sum+=i;
//         ds.remove(ds.size()-1);
//         sum-=i;
//         rec(n,k,i+1,ds,out);
//     }
//      public List<List<Integer>> combinationSum3(int k, int n) {
//         List<List<Integer>>out=new ArrayList<>();
//         List<Integer> ds=new ArrayList<>();
//         int i=1;
//         int sum=0;
//         rec(n,k,sum,ds,out);
//         return out;
//     }
// }
