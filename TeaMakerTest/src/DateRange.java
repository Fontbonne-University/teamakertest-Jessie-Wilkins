import java.text.SimpleDateFormat;
import java.util.*;

class DateRange {
    DateRange (Date start, Date end) {
        _start = start;
        _end = end;
    }
    Date getStart() {
        return _start;
    }
    Date getEnd() {
        return _end;
    }
    boolean includes(Date date) {
		return date.equals(getStart()) || date.equals(getEnd()) || (date.after(getStart()) && date.before(getEnd()));
	}
	private final Date _start;
    private final Date _end;
}