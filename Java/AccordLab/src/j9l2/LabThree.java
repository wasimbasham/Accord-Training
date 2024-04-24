package j9l2;

class Member {
	String member;

	Member(String member) {
		this.member = member;
	}

	void displayMembership() {
		System.out.println("Membership Type: " + member);
	}
}

class PlatinumMember extends Member {
	PlatinumMember() {
		super("Platinum");
	}

	void Lounge() {
		System.out.println("Accessing lounge...");
	}

	void WaitingRoom() {
		System.out.println("Accessing waiting room...");
	}
}

class GoldMember extends Member {
	GoldMember() {
		super("Gold");
	}

	void WaitingRoom() {
		System.out.println("Accessing waiting room...");
	}
}

public class LabThree {
	public static void main(String[] args) {
		PlatinumMember platinumMember = new PlatinumMember();
		platinumMember.displayMembership();
		platinumMember.Lounge();
		platinumMember.WaitingRoom();
		System.out.println();
		GoldMember goldMember = new GoldMember();
		goldMember.displayMembership();
		goldMember.WaitingRoom();
	}
}
