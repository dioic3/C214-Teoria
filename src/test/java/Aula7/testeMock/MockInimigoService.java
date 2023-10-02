package Aula7.testeMock;

import aula7.TesteMock.InimigoService;

public class MockInimigoService extends InimigoService {
    @Override
    public String busca(int id){
            if (id == 10){
                return InimigoConst
            }
    }

    @Override
    public boolean inimigoExistente(int id) {
        return false;
    }
}
