
package juegopreguntas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class JuegoPreguntas extends javax.swing.JFrame {
  
static String textoBaseDePreguntas= "¿Cuántos huesos tiene el cuerpo humano?\t206\t105\t90\t240"
+"\n"
+"¿Cuál es el río más largo del mundo?\tEl Amazonas\tNilo\tMississippi\tYang Tse Kiang" 
+"\n"
+"¿Cuántas notas musicales existen?\t12\t106\t5\t216"
+"\n"
+"¿Cuál es el lugar más frío de la tierra?\tLa Antártida\tAfrica\tCanada\tAmazonas"
+"\n"
+"¿Quién escribió La Odisea?\tHomero\tBar\tFlanders\tMarge"
+"\n"
+"¿Quién es el autor de el Quijote?\tMiguel de Cervantes Saavedra\tGarcia marguez\tSthephen king\tJJ benitez"
+"\n"
+" ¿Quién pintó “la última cena”?\tLeonardo da Vinci\tJuan fernando botero\tFrida kahlo\tMiguel angel"
+"\n"
+" ¿Cuál es el océano más grande?\tEl Océano Pacífico\tEl el Atlántico\tEl Índico\tel Ártico"
+"\n"
+" ¿Qué año llegó Cristóbal Colón a América?\t1492\t1469\t1888\t1380"
+"\n"
+"  ¿En qué año comenzó la II Guerra Mundial?\t1939\t1945\t2000\t1840"
+"\n"
+"  ¿Cuál es tercer planeta en el sistema solar?\tTierra\tMarte\tJupiter\tNeptuno"
+"\n"
+"  ¿Qué país tiene forma de bota?\tItalia\tPortugal\tEspañol\tBrazil"
+"\n"
+"  ¿Cual es país más poblado de la Tierra?\tChina\tBrazil\tRusia\tInglaterra"
+"\n"
+"  ¿Cuál es la ciudad de los rascacielos?\tNueva York \tParis\tLondres\tBrasilia"
+"\n"
+"  ¿En qué país se encuentra el famoso monumento Taj Mahal?\tla India \tChina\tJerusalen\tirak"
+"\n"
+"   ¿Quién era el general de los nazis en la Segunda Guerra Mundial?\tAdolf Hitler \tStanley\tNapoleon\tSadam Husein"
+"\n"
+"   ¿Cuál es el único mamífero capaz de volar?\tMulcielago? \tGallina\tRaton\tAveztruz"
+"\n"
+"   ¿Quién ganó el mundial de 2014? \tAlemania\tBrazil\tArgentina\tEspaña"
+"\n"
+"  ¿Quién escribió “Hamlet”? \tWilliam Shakespeare\tPablo Picasso\tVincent van Gogh\tClaude Monet"
+"\n"
+"  ¿Cuál es la nacionalidad de Pablo Neruda? \tChileno\tColombiano\tArgentino\tPeruano"
+"\n"
+"  ¿Quién traicionó a Jesús?\tJudas\tSimon\tPedro\tPablo"
+"\n"
+"  ¿Cuánto vale el número pi?\t3,1416\t3.333\t6.3453\t3.456456"
+"\n"
+"  El triángulo que tiene sus tres lados iguales ¿Cómo se llama?\tEquilátero\tIsosceles\tEscaleno\tTrapecio"
+"\n"
+"  ¿Cuándo empezó la Primera Guerra Mundial?\t1914\t1840\t1888\t1943"
+"\n"
+"  ¿Cuántos corazones tienen los pulpos?\t3\t6\t8\t1";





static String [] renglones= textoBaseDePreguntas.split("\n");
static int cantidadDePreguntas=renglones.length;

static String[][] baseDePreguntas = new String [cantidadDePreguntas][25];

   String [] preguntaEscogida;
   String Pregunta;
   String Respuesta;
   ArrayList<String> Opcion= new ArrayList<>();

   int n_pregunta=0;

public static void main(String args[]){

   try{
    
   for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
   if("Nimbus".equals(info.getName())){
   
   javax.swing.UIManager.setLookAndFeel(info.getClassName());
   break;
   }   
   
   }

   }catch(Exception ex){
   }
    for (int i = 0; i < renglones.length; i++) {
    String renglon= renglones[i];
    baseDePreguntas[i]=renglon.split("\t");
        
    }
   new JuegoPreguntas();
   }


    
   public void escogerPregunta(int n){

   preguntaEscogida=baseDePreguntas[n];
   Pregunta=preguntaEscogida[0];
   Respuesta=preguntaEscogida[1];
   Opcion.clear();
       for (int i = 1; i < preguntaEscogida.length; i++) {
           Opcion.add(preguntaEscogida[i]);
       }

       for (int i = 0; i < 10; i++) {
       Collections.shuffle(Opcion);
           
       }

   }

public void mostrarPregunta(){

jLabel1.setText(Pregunta);
jButton1.setText(Opcion.get(0));
jButton2.setText(Opcion.get(1)); 
jButton3.setText(Opcion.get(2)); 
jButton4.setText(Opcion.get(3));    

}

  void escogerRespuesta(int n){

 if(Opcion.get(n).equals(Respuesta)){
JOptionPane.showMessageDialog(
this,
"Su respuesta es correcta",
"exelente, muy bien",
JOptionPane.INFORMATION_MESSAGE);
  
}else{
JOptionPane.showMessageDialog(
this,
"Su respuesta es incorrecta, la respuesta es: " + Respuesta,
"Intentalo nuevamnete",
JOptionPane.ERROR_MESSAGE);
 }
jugar();
}


 

   public void jugar(){
if(n_pregunta==cantidadDePreguntas){
JOptionPane.showMessageDialog(
this,
"juego finalizado",
"exelente, muy bien",
JOptionPane.INFORMATION_MESSAGE
);

System.exit(0);

}

   escogerPregunta(n_pregunta);
   mostrarPregunta();
   n_pregunta++;
   }

    public JuegoPreguntas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        jugar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preguntas");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Opcion1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Opcion2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Opcion3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Opcion4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escogerRespuesta(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         escogerRespuesta(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escogerRespuesta(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         escogerRespuesta(3);
    }//GEN-LAST:event_jButton4ActionPerformed

  
  
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
