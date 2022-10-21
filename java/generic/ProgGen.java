class ProgGen {

	public static void main(String[] args) {

		SimpleStack<String> a = new SimpleStack<>();

		a.push("Anis");
		a.push("Aman");
		a.push("Arshad");
		a.push("Ansar");
		a.push("Anwar");
		a.push("Afroj");
		a.push("Ajaj");
		a.push("Altaf");
		a.push("Asad");

		for(var i = a.iterator(); i.hasNext();) {
			String s = i.next();
			System.out.println(s);
		}

		System.out.println("-------------");

		SimpleStack<Integer> b = new SimpleStack<>();

		b.push(24);
		b.push(22);
		b.push(20);
		b.push(24);
		b.push(22);
		b.push(18);
		b.push(27);
		b.push(29);
		b.push(10);

		for(int d : b)
			System.out.println(d);
	}
}



