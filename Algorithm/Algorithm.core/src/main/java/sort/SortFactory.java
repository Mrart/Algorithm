package sort;

public class SortFactory {
	 public static SortAbstract getSortInstance(String type){
		 switch (type){
		    case "SelectionSort":
			  return new SelectionSort();
			default:
				return null;
		 }
	 }
}
