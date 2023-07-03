class Solution {
    public String intToRoman(int num) {
        //HashMap<Character,Integer> cd=new HashMap<>();
        HashMap<Integer,String> id=new HashMap<>();
        id.put(1,"I");
        id.put(4,"IV");
        id.put(5,"V");
        id.put(9,"IX");
        id.put(10,"X");
        id.put(40,"XL");
        id.put(50,"L");
        id.put(90,"XC");
        id.put(100,"C");
        id.put(400,"CD");
        id.put(500,"D");
        id.put(900,"CM");
        id.put(1000,"M");
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1000);
        arr.add(900);
        arr.add(500);
        arr.add(400);
        arr.add(100);
        arr.add(90);
        
        arr.add(50);
        arr.add(40);
        arr.add(10);
        arr.add(9);
        arr.add(5);
        arr.add(4);
        arr.add(1);
        int i=0;
        String out="";
        while(num>0){
            if(arr.get(i)<=num){
                out+=id.get(arr.get(i));
                num-=arr.get(i);
            }
            else{
                i++;
            }
        }
    return out;
        
        
    }
}