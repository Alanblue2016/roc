package rock.bean.inter;

import rock.bean.FromBean;
import rock.bean.ToBean;

public interface MethodCallBack {

    String getMethodName();

    ToBean callMethod(FromBean frombean) throws Exception;
}
