package Exercise3_Manajer;

public abstract class Sortable {
	public abstract int compare(Sortable b);
	
	public static void shell_sort(Sortable[] a){ 
		int n = a.length;
		int interval = n/2;
		
		while (interval > 0) {
			for (int i=interval; i<n; i++) {
				Sortable temp = a[i];
				int j=i;

				while (j>=interval && a[j-interval].compare(temp) > 0) {
					a[j] = a[j-interval];
                    j=j-interval;
				}
				a[j]=temp;
			}
			interval /= 2;
		}
		
	}

}
