class StringBufferCapacity
{
	public static void main(String args[])
	{
	StringBuffer sb= new StringBuffer();
	System.out.println(sb.capacity()); //default
	sb.append("hello");
	System.out.println(sb.capacity()); //will display 16
	sb.append("java is my favourite language");
	System.out.println(sb.capacity()); // will display (16*2)+2=34
	}
}