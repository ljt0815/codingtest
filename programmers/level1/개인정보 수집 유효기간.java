import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Document[] document = new Document[privacies.length];
        Map<Character, Integer> map = new HashMap<>();
        int year;
        int month;
        int day;
        int j;
        
        for (int i = 0; i < terms.length; i++) {
            j = 1;
            int term = 0;
            while (++j < terms[i].length())
                term = (term * 10) + (terms[i].charAt(j) - '0');
            map.put((char)terms[i].charAt(0), term);
        }
        for (int i = 0; i < privacies.length; i++) {
            year = 0;
            month = 0;
            day = 0;
            j = -1;
            while (privacies[i].charAt(++j) != '.')
                year = (year * 10) + (privacies[i].charAt(j) - '0');
            while (privacies[i].charAt(++j) != '.')
                month = (month * 10) + (privacies[i].charAt(j) - '0');
            while (privacies[i].charAt(++j) != ' ')
                day = (day * 10) + (privacies[i].charAt(j) - '0');
            document[i] = new Document(i+1, year, month, day, map.get((char)privacies[i].charAt(++j)));
        }
        
        j = -1;
        year = 0;
        month = 0;
        day = 0;
        while (today.charAt(++j) != '.')
            year = (year * 10) + (today.charAt(j) - '0');
        while (today.charAt(++j) != '.')
            month = (month * 10) + (today.charAt(j) - '0');
        while (++j < today.length())
            day = (day * 10) + (today.charAt(j) - '0');
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++)
            if (!(document[i].isExpired(year, month, day)))
                list.add(document[i].getId());
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ret[i] = list.get(i);
        return ret;
    }
}

class Document {
    public int id;
    int year;
    int month;
    int day;
    int term;
    int expireYear;
    int expireMonth;
    int expireDay;
    
    public int getId() {
        return this.id;
    }
    
    Document(int id, int year, int month, int day, int term) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.term = term;
        int termYear = 0;
        int termMonth = 0;
        int termAppend = 0;
        this.expireDay = day - 1;
        
        if (day == 1) {
            termAppend = 1;
            this.expireDay = 28;
        }
        termYear = (term - termAppend) / 12;
        termMonth = (term - termAppend) % 12;
        if (month + termMonth > 12) {
            termYear++;
            this.expireMonth = termMonth + month - 12;
            this.expireYear = year + termYear;
        } else {
            this.expireMonth = month + termMonth;
            this.expireYear = year + termYear;
        }
 
    }
    public boolean isExpired(int year, int month, int day){
        if (expireYear < year)
            return false;
        if (expireYear == year && expireMonth < month)
            return false;
        if (expireYear == year && expireMonth == month && expireDay < day)
            return false;
        return true;
    }
    @Override
	public String toString() {
		return "Document [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day + ", term=" + term + "]" + "\nexpireYear=" + expireYear + ", expireMonth=" + expireMonth + ", expireDay=" + expireDay;
	}
}