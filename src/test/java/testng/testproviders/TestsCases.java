package testng.testproviders;

/**
 * Created by kaiser_zhao on 2019/10/11.
 */
public interface TestsCases {

    // For Rest API
    public String getQueryResourceUniqueName();

    public int getLoopNumber();

    public String getOperation();

//    public void setUseCaseHeader(UseCase.UseCaseHeader value);
//
//    public UseCase.UseCaseHeader getUseCaseHeader();

    public boolean isCommonResource();


}
