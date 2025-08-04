package kadai_018;

public abstract class Kato_Chapter18 {

	String familyName = "加藤";
	String givenName;
	String address;
	
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です。");
		System.out.println("住所は東京都中野区〇×です。");
	}
	
	abstract public	void eachIntroduce();
	
	public void	execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}
