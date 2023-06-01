package dev.syntax.step02logging;

import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class MyFomatter {
	public class MyFormatter extends SimpleFormatter {

		// log에 출력되는 방식을 커스텀 할 수 있음
		@Override
		public String format(LogRecord record) {
			return record.getSourceClassName()+"::"
	                +record.getSourceMethodName()+"::"
	                +new Date(record.getMillis())+"::"
	                +record.getMessage()+"\n";
	    }
		
	}
}
