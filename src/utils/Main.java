package utils;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FormattedLine h = new FormattedLine("Lorem ipsume");
		h.setTopHeader(true);
		h.setAlignment(FormattedLine.Alignment.CENTER);
		FormattedLine n = new FormattedLine("");
		n.setBottomHeader(true);
		FormattedLine dl = new FormattedLine(
		"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut commodo sapien. Maecenas scelerisque quis dolor ac volutpat. Sed dapibus enim at fringilla iaculis. Curabitur et ornare urna. Pellentesque et quam vulputate, euismod libero vel, ultrices elit. Vestibulum venenatis ligula at augue gravida, ac vulputate nulla eleifend. Pellentesque a urna eu mi porttitor hendrerit eget eu augue. Sed sit amet scelerisque elit. Cras luctus interdum neque."
		);
		dl.setAlignment(FormattedLine.Alignment.RIGHT);
		System.out.print(h);
		System.out.print(dl);
		System.out.print(n);

	}

}
