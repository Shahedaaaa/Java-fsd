package pack1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ImplementingMaps 
{
	void hashmap()
	{
		System.out.println("Implementing Hash map");
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		map.put(101,"Java");
		map.put("java", 1000);
		map.put(null, null);
		map.put(105, "Java");
		map.put(103, 2000);
		System.out.println(map);
		System.out.println("-------------------");
		HashSet<Object> hs1=new HashSet<Object>(map.keySet());
		System.out.println("keys: " +hs1);
		Iterator<Object> i1=hs1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		HashSet<Object> hs2=new HashSet<Object>(map.entrySet());
		System.out.println("Data: " +hs2);
		Iterator<Object> i2=hs2.iterator();
		while(i2.hasNext())
		{
			Entry e=(Entry)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
	}
	void HashTable()
	{
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(101, "Java");
		ht.put("Java", 1000);
		ht.put(104, "Oracle");
		ht.put(105, "Java");
		System.out.println(ht);
		System.out.println("---------------");
		HashSet<Object> hs3=new HashSet<Object>(ht.keySet());
		System.out.println("keys: " +hs3);
		HashSet<Object> hs4=new HashSet<Object>(ht.entrySet());
		Iterator<Object> i3=hs4.iterator();
		
		while(i3.hasNext())
		{
			Entry e1=(Entry)i3.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
			
		}
		
	}
	void TreeMap()
	{
		TreeMap<Object,Object> map1=new TreeMap<Object,Object>();
		map1.put(101, "Java");
		map1.put(104, 1000);
		map1.put(104, 1000);
		map1.put(109, null);
		map1.put(105, "Java");
		System.out.println(map1);
		System.out.println("--------------------");
		LinkedHashSet<Object> lh=new LinkedHashSet<Object>(map1.keySet());
		System.out.println("Keys: " +lh);
		Iterator<Object> i4=lh.iterator();
		while(i4.hasNext())
		{
			System.out.println(i4.next());
		}
		System.out.println("------------------");
		LinkedHashSet<Object> lh1=new LinkedHashSet<Object>(map1.entrySet());
		System.out.println("Data: " +lh1);
		Iterator<Object> i5=lh1.iterator();
		while(i5.hasNext())
		{
			Entry e2=(Entry)i5.next();
			System.out.println(e2.getKey()+" "+e2.getValue());
		}
		

		
	}
	void LinkedHashMap()
	{
		LinkedHashMap<Object,Object> map2=new LinkedHashMap<Object,Object>();
		map2.put(101, "Java");
		map2.put("Java", 1002);
		map2.put(null, null);
		map2.put(106, "Java");
		System.out.println(map2);
		System.out.println("-----------------");
		LinkedHashSet<Object> lh2=new LinkedHashSet<Object>(map2.entrySet());
		System.out.println("Data: " +lh2);
		Iterator<Object> i6=lh2.iterator();
		while(i6.hasNext())
		{
			Entry e3=(Entry)i6.next();
			System.out.println(e3.getKey()+" "+e3.getValue());
		}
	}
	public static void main(String[] args) 
	{
		ImplementingMaps maps=new ImplementingMaps();
		//maps.hashmap();
		//maps.HashTable();
		//maps.TreeMap();
		maps.LinkedHashMap();
		
	}

}
