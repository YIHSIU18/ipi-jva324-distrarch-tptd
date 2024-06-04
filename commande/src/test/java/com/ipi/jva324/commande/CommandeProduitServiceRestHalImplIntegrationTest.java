package com.ipi.jva324.commande;

import com.ipi.jva324.Jva324Application;
import com.ipi.jva324.commande.model.Commande;
import com.ipi.jva324.commande.service.CommandeProduitServiceRESTHALImpl;
import com.ipi.jva324.commande.service.CommandeService;
import com.ipi.jva324.stock.model.ProduitEnStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) // Junit 4 : @RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(Jva324Application.class)
public class CommandeProduitServiceRestHalImplIntegrationTest {

    /** TODO rm, pas utile ici */
    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private CommandeProduitServiceRESTHALImpl commandeProduitServiceRESTHAL;

    @BeforeEach
    void setUp() {

    }

    /**
     * TD
     * */
    @Test
    public void testCommandeHAL(){
        // produit créé en init
        ProduitEnStock p1 = commandeProduitServiceRESTHAL.getProduit(1);
        Assertions.assertEquals(p1.getQuantiteDisponible(), 10);

    }



}
