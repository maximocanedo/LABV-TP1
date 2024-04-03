package utils;

public class DelimiterLine {	
	public static enum Alignment { LEFT, CENTER, RIGHT };
	private String leftDelimiter = "|";
	private String rightDelimiter = "|";
	private int padding = 1;
	private int lineSize = 40;
	private String content;
	private boolean isTopHeader = false;
	private boolean isBottomHeader = false;
	private char topLeftDelimiter = '·';
	private char topRightDelimiter = '·';
	private char bottomLeftDelimiter = '·';
	private char bottomRightDelimiter = '·';
	private char topHeaderMiddleDelimiter = '—';
	private char bottomHeaderMiddleDelimiter = '—';
	private Alignment alignment = Alignment.LEFT;

	public DelimiterLine(String content) {
		this.setContent(content);
	}
	
	public String toString() {
		int padding = this.getPadding();
		int size = this.getLineSize();
		String res = "";
		int lines = this.getLinesUsed();
		char del = ' ';
		if(this.isTopHeader) del = topHeaderMiddleDelimiter;
		else if(this.isBottomHeader) del = bottomHeaderMiddleDelimiter;
		else del = ' ';
		
		char[] corners = this.getCornerDelimiters();
		
		for(int i = 0; i <= lines; i++) {
			
			// Start delimiter
			if(i == 0 && this.isTopHeader) res += corners[0];
			else if( i == 0 && this.isBottomHeader) res += corners[2];
			else res += this.getLeftDelimiter();
			
			
			// Start padding
			for(int j = 0; j < this.getPadding(); j++) res += del;
			
			
			// Content
			String pagedContent = "";
			String rawContent = this.getContent().substring(i * size, Math.min(this.getContent().length(), (size * i) + size));
			if(this.getAlignment() != Alignment.CENTER) {
				if(this.getAlignment() == Alignment.LEFT) pagedContent += rawContent;
				if(rawContent.length() < size) {
					for(int k = rawContent.length(); k < size; k++) {
						pagedContent += del;
					}
				}
				if(this.getAlignment() == Alignment.RIGHT) pagedContent += rawContent;				
			}
			else {
				int availableSpace = size - rawContent.length();
				if(size > 0) {
					int leftPadding = (int) (Math.ceil(availableSpace / 2) / 1);
					int rightPadding = (int) (Math.floor(availableSpace / 2) / 1);
					if(availableSpace % 2 != 0) leftPadding++;
					for(int l = 0; l < leftPadding; l++) {
						pagedContent += del;
					}
					pagedContent += rawContent;
					for(int l = 0; l < rightPadding; l++) {
						pagedContent += del;
					}
				} else pagedContent += del;
			}
			res += pagedContent;
			
			// End padding
			for(int j = 0; j < padding; j++) res += del;
			
			// End delimiter
			if(i == 0 && this.isTopHeader) res += corners[1];
			else if(i == 0 && this.isBottomHeader) res += corners[3];
			else res += this.getRightDelimiter();
			
			// Line break
			res += "\n";
		}
		return res;
	}
	
	public int getLinesUsed() {
		return (int)(Math.ceil(this.getContent().length() / this.getLineSize()) / 1);
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getLeftDelimiter() {
		return leftDelimiter;
	} 
	
	public void setLeftDelimiter(String leftDelimiter) {
		this.leftDelimiter = leftDelimiter;
	}

	public String getRightDelimiter() {
		return rightDelimiter;
	}

	public void setRightDelimiter(String rightDelimiter) {
		this.rightDelimiter = rightDelimiter;
	}

	public int getPadding() {
		return padding;
	}

	public void setPadding(int padding) {
		this.padding = padding;
	}

	public int getLineSize() {
		return lineSize;
	}

	public void setLineSize(int lineSize) {
		this.lineSize = lineSize;
	}

	public void setTopHeader(boolean isTopHeader) {
		this.isTopHeader = isTopHeader;
		if(isTopHeader && this.isBottomHeader) this.isBottomHeader = false;
	}
	
	public boolean isTopHeader() {
		return this.isTopHeader;
	}

	public void setBottomHeader(boolean isBottomHeader) {
		this.isBottomHeader = isBottomHeader;
		if(isBottomHeader && this.isTopHeader) this.isTopHeader = false;
	}
	
	public boolean isBottomHeader() {
		return this.isTopHeader;
	}
	
	public Alignment getAlignment() {
		return this.alignment;
	}
	
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	
	public char getTopHeaderMiddleDelimiter() {
		return this.topHeaderMiddleDelimiter;
	}
	public char getBottomHeaderMiddleDelimiter() {
		return this.bottomHeaderMiddleDelimiter;
	}
	public void setHeaderMiddleDelimiters(char del) {
		this.topHeaderMiddleDelimiter = del;
		this.bottomHeaderMiddleDelimiter = del;
	}
	public void setHeaderMiddleDelimiters(char topDelimiter, char bottomDelimiter) {
		this.topHeaderMiddleDelimiter = topDelimiter;
		this.bottomHeaderMiddleDelimiter = bottomDelimiter;
	}
	
	public char[] getCornerDelimiters() {
		return new char[] {
			this.topLeftDelimiter,
			this.topRightDelimiter,
			this.bottomLeftDelimiter,
			this.bottomRightDelimiter
		};
	}
	public void setCornerDelimiters(char delimiter) {
		this.topLeftDelimiter = delimiter;
		this.topRightDelimiter = delimiter;
		this.bottomLeftDelimiter = delimiter;
		this.bottomRightDelimiter = delimiter;
	}
	public void setCornerDelimiters(char leftDelimiter, char rightDelimiter) {
		this.topLeftDelimiter = leftDelimiter;
		this.topRightDelimiter = rightDelimiter;
		this.bottomLeftDelimiter = leftDelimiter;
		this.bottomRightDelimiter = rightDelimiter;
	}
	public void setCornerDelimiters(char topLeftDelimiter, char topRightDelimiter, char bottomDelimiter) {
		this.topLeftDelimiter = topLeftDelimiter;
		this.topRightDelimiter = topRightDelimiter;
		this.bottomLeftDelimiter = bottomDelimiter;
		this.bottomRightDelimiter = bottomDelimiter;
	}
	public void setCornerDelimiters(char topLeftDelimiter, char topRightDelimiter, char bottomLeftDelimiter, char bottomRightDelimiter) {
		this.topLeftDelimiter = topLeftDelimiter;
		this.topRightDelimiter = topRightDelimiter;
		this.bottomLeftDelimiter = bottomLeftDelimiter;
		this.bottomRightDelimiter = bottomRightDelimiter;
	}

}
