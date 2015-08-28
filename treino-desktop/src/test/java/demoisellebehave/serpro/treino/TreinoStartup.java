package demoisellebehave.serpro.treino;

import javax.swing.JFrame;

import br.gov.frameworkdemoiselle.behave.runner.fest.FestStartup;
import demoisellebehave.serpro.treino.ui.JFrameLogin;
import java.util.Locale;

public class TreinoStartup implements FestStartup {

    public JFrame getFrame() {
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("TreinoStartup");
        return new JFrameLogin();
    }

}
