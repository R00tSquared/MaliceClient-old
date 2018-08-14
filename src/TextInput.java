// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

final class TextInput {

//FormationX

	/*public static String method525(int i, Stream stream) {
		int j = 0;
		int k = -1;
		for(int l = 0; l < i; l++) {
			int i1 = stream.readUnsignedByte();
					aCharArray631[j++] = validChars[i1];
		}
		boolean flag1 = true;
		for(int k1 = 0; k1 < j; k1++) {
			char c = aCharArray631[k1];
			if(flag1 && c >= 'a' && c <= 'z') {
				aCharArray631[k1] += '\uFFE0';
				flag1 = false;
			}
			if(c == '.' || c == '!' || c == '?')
				flag1 = true;
		}
		return new String(aCharArray631, 0, j);
	}

	public static void method526(String s, Stream stream) {
		if(s.length() > 80)
			s = s.substring(0, 80);
		s = s.toLowerCase();
		int i = -1;
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j); 
			int k = 0;
			for(int l = 0; l < validChars.length; l++) {
				if(c != validChars[l])
					continue;
				k = l;
				break;
			}
			stream.writeWordBigEndian(k);
		}
	}*/
	
	public static String method525(int i, Stream stream) {
		int j = 0;
		// System.out.println("readed ");
		for (int l = 0; l < i; l++) {
			int i1 = stream.getUnsigned();
			// System.out.print(validChars[i1]);
			aCharArray631[j++] = (char) i1;
		}
		String string = new String(aCharArray631, 0, j);
		return Character.toUpperCase(string.charAt(0)) + string.substring(1);
	}

	public static void method526(String s, Stream stream) {
		if (s.length() > 80) {
			s = s.substring(0, 80);
		}
		//s = s.toLowerCase();
		s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			stream.writeWordBigEndian(c);
		}
	}
	
	public static String capitalize(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				s = String.format( "%s%s",
                         Character.toUpperCase(s.charAt(0)),
                         s.substring(1) );
			}
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				if (i + 1 < s.length()) {
					s = String.format( "%s%s%s",
                             s.subSequence(0, i+1),
                             Character.toUpperCase(s.charAt(i + 1)),
                             s.substring(i+2) );
				}
			}
		}
		return s;
	}

	public static String processText(String s)
	{
//		stream.currentOffset = 0;
//		method526(s, stream);
//		int j = stream.currentOffset;
//		stream.currentOffset = 0;
//		String s1 = method525(j, stream);
		
		//s = s.toLowerCase();
		
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	private static final char[] aCharArray631 = new char[100];

}
