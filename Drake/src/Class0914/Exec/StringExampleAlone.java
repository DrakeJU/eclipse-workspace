package Class0914.Exec;

public class StringExampleAlone {

	public static void main(String[] args) {
		
		String a = new String("안녕하세요 JAVA self study 입니다.");
		System.out.println(a.length());
		System.out.println(a.substring(5));
		
		System.out.println(a.indexOf('s', 5));
		
		String aa ="I Love you".concat("!");
		System.out.println(aa);
		
		
		System.out.println("Java Programming Basic".toLowerCase());
		System.out.println("java prooooooogrammming bbbbasic".toUpperCase());
		System.out.println("	안녕하세요".trim());
	
		System.out.println(a.equalsIgnoreCase(aa));
	
	}	

}
/*
String 클래스에서 제공해 주는 메소드를 분류
문자열 비교
문자열 찾기
문자열 추출
문자열을 복사하여 새로운 문자열 생성 (대문자화와 소문자화도 가능)
문자열의 합치하는 + 연산자 제공
문자열로의 형변환(conversion)은 Object 클래스의 toString 메소드를 이용




public int length(): 문자열의 길이를 얻습니다. 이 길이는 문자열 내에 있는 16-비트 유니코드 문자의 수와 같습니다.

public char charAt(int index): 문자열 내에서 주어진 index위치에 있는 문자를 얻습니다. 이 때, 
	index의 범위는 0에서(length()-1) 사이의 값으로, 첫 번째 문자의 index 값은 0입니다. 
	만약, index 값이 범위를 벗어난 값이라면, IndexOutOfBoundsException 예외를 발생시키게 됩니다.

public boolean equalsIgnoreCase(String anotherString): 이 문자열과 주어진 anotherString 객체에 있는 문자열과 대소문자 
	구별없이 비교하여 그 결과를 얻습니다. 만약, 주어진 객체가 null이 아니고 이 객체와 같은 문자열을 표현하고 있으면 true를 리턴합니다.

public boolean startsWith(String prefix): 이 문자열이 주어진 문자열로 시작하는지 여부를 검사합니다. 
	만약, prefix가 null이면, NullPointerException 예외를 발생시킵니다.

public boolean endsWith(String suffix): 주어진 문자열로 끝나는지 여부를 검사합니다. 
	만약, suffix가 null이면, NullPointerException 예외를 발생시킵니다.

public int indexOf(int ch): 주어진 문자 ch가 이 문자열 내에서 처음으로 나타나는 인덱스를 얻습니다. 
	만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다.

public int indexOf(int ch, int fromIndex): 주어진 문자 ch가 이 문자열 내에서 fromIndex 이후 처음으로 나타나는 인덱스를 얻습니다. 
	만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다.

public int lastIndexOf(int ch): 주어진 문자 ch가 이 문자열 내에서 마지막으로 나타나는 인덱스를 얻습니다. 
	만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다.

public int lastIndexOf(int ch, int fromIndex): 주어진 문자 ch가 이 문자열 내에서 fromIndex 이 전 마지막으로 나타나는 
	인덱스를 얻습니다. 만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다.

public int indexOf(String str): 주어진 문자열 str이 이 문자열 내에서 처음으로 나타나는 인덱스를 얻습니다. 
	만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다. 만약, str이 null이면, NullPointerException 예외가 발생합니다.

public int indexOf(String str, int fromIndex): 주어진 문자열 str이 이 문자열 내에서 fromIndex 이후 처음으로 나타나는 
	인덱스를 얻습니다. 만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 됩니다. 만약, str이 null이면, NullPointerException 예외가 발생합니다.

public int lastIndexOf(String str): 주어진 문자열 str이 이 문자열 내에서 마지막으로 나타나는 인덱스를 얻습니다. 
	만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 되고, str이 null이면, NullPointerException 예외가 발생합니다.

public int lastIndexOf(String str, int fromIndex): 주어진 문자열 str이 이 문자열 내에서 fromIndex 이전 마지막으로 나타나는 
	인덱스를 얻습니다. 만약, 주어진 문자가 문자열 내에 존재하지 않으면 -1이 되고, str이 null이면, NullPointerException 예외가 발생합니다.

public String substring(int beginIndex): 주어진 인덱스부터 마지막까지의 문자열을 얻습니다. 
	만약, 주어진 인덱스가 범위를 벗어나면, IndexOutOfBoundsException 예외를 발생시키는데, 예를 들면, 다음과 같습니다.

예)
"unhappy".substring(2) returns "happy"

"Harbison".substring(3) returns "bison"

"emptiness".substring(9) returns "" (an empty string)

public String substring(int beginIndex, int endIndex): 주어진 인덱스들에 해당하는 문자열을 얻습니다. 만약, 주어진 인덱스가 범위를 벗어나면, IndexOutOfBoundsException 예외를 발생시키는데, 예를 들면, 다음과 같습니다.

"hamburger".substring(4, 8) returns "urge"

"smiles".substring(1, 5) returns "mile"
------------------------------------------------------------------------------------------
public String concat(String str): 이 객체가 가리키는 문자열의 끝에 주어진 문자열을 더한 후, 그 결과 생성된 문자열을 새로운 
	String 객체에 저장하여 얻습니다. 만약, str이 null이면, NullPointerException 예외가 발생하고, 다음과 같은 예를 들 수 있습니다.

"cares".concat("s") returns "caress"

"to".concat("get").concat("her") returns "together"
-------------------------------------------------------------------------------------------
public String replace(char oldChar, char newChar): 문자열 내의 모든 oldChar 문자들을 newChar로 바꾸어, 
	새로운 문자열 객체를 생성하여 이 문자열을 얻습니다.  다음과 같은 예를 들 수 있습니다.

"mesquite in your cellar".replace('e', 'o') returns "mosquito in your collar"

"the war of baronets".replace('r', 'y') returns "the way of bayonets"

"sparring with a purple porpoise".replace('p', 't') returns "starring with a turtle tortoise"

"JonL".replace('q', 'x') returns "JonL" (no change)
--------------------------------------------------------------------------------------------
public String toLowerCase(Locale locale): 이 문자열 내의 모든 문자들을 주어진 Locale에 따라 소문자로 바꾸어 생성된 새로운 문자열을 얻습니다. 

public String toLowerCase(): 이 문자열 내의 모든 문자들을 디폴트 Locale에 따라 소문자로 바꾸어 생성된 새로운 문자열을 얻습니다. 다음과 같은 예를 들 수 있습니다.

"French Fries".toLowerCase() returns "french fries"

"".toLowerCase() returns ""

public String toUpperCase(Locale locale): 이 문자열 내의 모든 문자들을 주어진 Locale에 따라 대문자로 바꾸어 생성된 새로운 문자열을 얻습니다.

public String toUpperCase(): 이 문자열 내의 모든 문자들을 디폴트 Locale에 따라 소문자로 바꾸어 생성된 새로운 문자열을 얻습니다. 다음과 같은 예를 들 수 있습니다.

예)	"Fahrvergn?en".toUpperCase() returns "FAHRVERGN?EN"

	"Visit Ljubinje!".toUpperCase() returns "VISIT LJUBINJE!"

public String trim(): 문자열의 양 끝에 있는 공백문자들을 제거하여 생성된 새로운 문자열을 얻습니다. 
*/