package Test.test;

public class BulletinBoard {
	
	private int totalPostCnt = 84;	//	�� ����Ʈ(�Խù�) ����
	private int maxPostCntPerPage = 10;	//	���������� �����ټ� �ִ� �ִ� ����Ʈ(�Խù�) ����
	
	private int totalPageCnt = 0;	//	[1][2][3][4][5]...
	
	private int maxPageCntPerPage = 10; // [1] ~ [10]

	void setTotalPostCnt(int totalPostCnt) {
		this.totalPostCnt = totalPostCnt;
	}
	int getTotalPostCnt() {
		return this.totalPostCnt;
	}
	void setMaxPostCntPerPage(int maxPostCntPerPage) {
		this.maxPostCntPerPage = maxPostCntPerPage;
	}
	int getMaxPostCntPerPage() {
		return this.maxPostCntPerPage;
	}
	
	
	
		
	public void displayPageNums() {
		// ����Ʈ ������ 0 �� ���
		// 	"ǥ���� �Խù��� �����ϴ�."
		// ������ ���� 5 ���� ���
		// 	[1] [2] [3] [4] [5]
		// ������ ���� max page count �� �Ѿ ���
		//	[1] [2] [3] . . . [max page count]
		
		if(totalPostCnt <= 0) {
			System.out.println("ǥ���� �Խù��� �����ϴ�.");
			return;
		}
		
		totalPageCnt = totalPostCnt/maxPostCntPerPage;
		if(totalPostCnt%maxPostCntPerPage > 0) {
			totalPageCnt++;
		}
		
		int pageCount = (totalPageCnt < maxPageCntPerPage)? totalPageCnt:maxPageCntPerPage;
		
		for(int i=1; i<=pageCount; i++) {
			System.out.print("["+i+"]");
		}	
	}
}
