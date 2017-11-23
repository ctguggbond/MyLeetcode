class Solution {
    public int romanToInt(String s) {
	Map<String,Integer> m = new HashMap<String,Integer>();
	m.put("M",1000); m.put("CM",900);
	m.put("D",500);  m.put("CD",400);
	m.put("C",100);  m.put("XC",90);
	m.put("L",50);   m.put("XL",40);
	m.put("X",10);   m.put("IX",9);
	m.put("V",5);    m.put("IV",4);
	m.put("I",1);

	int len = s.length();
	int res = 0;
	for(int i = 0; i < len; i++){
	    String s1 = String.valueOf(s.charAt(i));
	    if(i < len -1){
		String s2 = s1 + s.charAt(i+1);
		if(m.containsKey(s2)){
		    s1 = s2;
		    i++;
		}
	    }
	    res += m.get(s1);
	}
	return res;
    }
}
