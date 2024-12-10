package fundamentos3;

public class TESTE2 {

	public static void main(String[] args) {
		String[] words = str.split("\\s");
	    StringBuilder sb = new StringBuilder();

	    for(int i = 0; i < words.length; i++){
	        sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
	        sb.append(" ");
	        return sb.toString();
	    }

	   
		// TODO Auto-generated method stub

	}

}
