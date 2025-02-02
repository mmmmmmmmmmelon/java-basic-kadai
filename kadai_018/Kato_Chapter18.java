package kadai_018;

public abstract class Kato_Chapter18 {
    String familyName = "加藤"; // 姓
    String givenName; // 名
    String address = "住所は東京都中野区〇×です"; // 住所

    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println(address);
    }

    abstract public void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }

	public void setGivenName() {
	}

}
