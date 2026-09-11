class Solution {
    public int romanToInt(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // map.put('I',1);
        // map.put('V',5);
        // map.put('X',10);
        // map.put('L',50);
        // map.put('C',100);
        // map.put('D',500);
        // map.put('M',1000);
        // int value = map.get(s.charAt(s.length()-1));
        // int previousValue = value;
        // for(int i = s.length()-2; i>=0; i--)
        // {
        //     int charValue = map.get(s.charAt(i));
        //     value += (charValue >= previousValue) ? charValue : -charValue;
        //     previousValue = charValue;
        // }
        // return value;
        int[] arr = new int[26];
        arr['i'-'a'] = 1;
        arr['v'-'a'] = 5;
        arr['x'-'a'] = 10;
        arr['l'-'a'] = 50;
        arr['c'-'a'] = 100;
        arr['d'-'a'] = 500;
        arr['m'-'a'] = 1000;
        int value = arr[Character.toLowerCase(s.charAt(s.length()-1)) - 'a'];
        int previousValue = value;
        for(int i = s.length()-2; i>=0; i--)
        {
            int charValue = arr[Character.toLowerCase(s.charAt(i)) - 'a'];
            value += (charValue >= previousValue) ? charValue : -charValue;
            previousValue = charValue;
        }
        return value;
    }
}