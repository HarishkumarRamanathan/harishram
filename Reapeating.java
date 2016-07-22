public class RepeatingChar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		boolean status = false;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == j) {
					continue;
				} else {
					if (ch[i] == ch[j]) {
						status = true;
						break;
					} else {
						status = false;
						index = i;
					}
				}
			}

			if (status) {

				System.out.println("Non repeating String:" + ch[index]);
			}
		}
	}
}
