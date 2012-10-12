package webapi;
import java.util.*;
import net.arnx.jsonic.JSON;
import webapi.html.HTMLCacher;
import webapi.model.Command;

class Dispatcher {

	static public String dispatch(Command cmd){
		String methodName = cmd.getMethod().name;
		if("getHTML".equals(methodName)){
			String filename = cmd.getMethod().params.get("filename") + ".html";
			return JSON.encode(HTMLCacher.getHTML(filename));
		}else if("getPerson".equals(methodName)){
			HashSet<String> s = new HashSet<String>();
			s.add("受注入力");
			s.add("出荷案内");
			data.user.Role r = new data.user.Role("オペレーター第2種", s);
			r.save();
			r.save();
			r.save();
			r.name = "変更したよ！";
			r.save();
			r.save();
			data.user.User u = new data.user.User("nao01", "a++b++C--qwert", "太棚田直一郎", r);
    		return JSON.encode(u);
		}else{
			return null;
		}
	}
	
}
/*
class Dispatcher {

	static public String dispatch(Command cmd){
		if(cmd.getMethod().name.matches("giveme_.*")){
			return loadHTMLElementAsString(cmd);
		}else{
			return doOtherOperation(cmd);
		}
	}

	static private String loadHTMLElementAsString(Command cmd){
		String fileName = cmd.getMethod().name.replaceFirst("giveme_", "");
		return JSON.encode(HTMLCacher.giveMeFileAsSimpleString(fileName + ".html"));
	}
	
	static private String doOtherOperation(Command cmd){
		String methodName = cmd.getMethod().name;
		if("getPerson".equals(methodName)){
			HashSet<String> s = new HashSet<String>();
			s.add("受注入力");
			s.add("出荷案内");
			d.u.Role r = new d.u.Role("オペレーター第2種", s);
			d.u.User u = new d.u.User("nao01", "a++b++C--qwert", "太田直宏", r);
    		return JSON.encode(u);
		}else{
			return null;
		}
	}
	
}

*/
