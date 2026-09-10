class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int value = map.get(s.charAt(s.length()-1));
        int previousValue = value;
        for(int i = s.length()-2; i>=0; i--)
        {
            int charValue = map.get(s.charAt(i));
            value += (charValue >= previousValue) ? charValue : -charValue;
            previousValue = charValue;
        }
        return value;
    }
}