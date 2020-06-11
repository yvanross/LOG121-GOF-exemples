package Commande.Bottin;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

/**
 * Vue principale de l'application Bottin
 * Vue créée avec Eclipse WindowsBuilder
 * @author Vincent Lacasse
 */
@SuppressWarnings({"serial","deprecation"})
public class VuePrincipale extends JFrame implements ListSelectionListener, ListDataListener {
	public final static int N_CAR = 20;	// nombre de caracteres pour les TextFields
	public final static int N_ITEM = 5;	// nombre d'items affichés dans la liste
	
	private Bottin bottin;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtNumero;
	private JList<Fiche> liste;
	private Action voirAction;
	private Action ajouterAction;
	private Action editerAction; 
	private Action detruireAction;
	private Action fermerAction;
	private Action defaireAction; 
	private Action refaireAction;

	/**
	 * Create the frame.
	 */
	// @SuppressWarnings({"deprecation"})
	public VuePrincipale(Bottin bottin) {
		super("Bottin");
		this.bottin = bottin;
		
		/*
		 *  Creer les "Action"
		 */
		voirAction     = new FicheActionVoir    (bottin, this, "Voir",     null, "Voir une fiche", new Integer(KeyEvent.VK_V));
		ajouterAction  = new FicheActionAjouter (bottin, this, "Ajouter",  null, "Ajouter une fiche", new Integer(KeyEvent.VK_A));
		editerAction   = new FicheActionEditer  (bottin, this, "Éditer",   null, "Éditer une fiche", new Integer(KeyEvent.VK_E));
		detruireAction = new FicheActionDetruire(bottin, this, "Détruire", null, "Détruire une fiche", new Integer(KeyEvent.VK_D));
		fermerAction   = new FicheActionFermer  (bottin, this, "Fermer",   null, "Sauvegarder le bottin et fermer l'application", new Integer(KeyEvent.VK_F));
		defaireAction  = new FicheActionDefaire (bottin, this, "Défaire",  null, "Défaire la denière action", new Integer(KeyEvent.VK_Z));
		refaireAction  = new FicheActionRefaire (bottin, this, "Refaire",  null, "Refaire la dernière action détaite", new Integer(KeyEvent.VK_Y));

		/*
		 * Creer le menu et associer les actions
		 */
		JMenuBar menuBar        = new JMenuBar();
        JMenu fichierMenu       = new JMenu("Fichier");
        JMenu editerMenu        = new JMenu("Éditer");
        JMenuItem voirItem      = new JMenuItem(voirAction);
        JMenuItem ajouterItem   = new JMenuItem(ajouterAction);
        JMenuItem editerItem    = new JMenuItem(editerAction);
        JMenuItem detruireItem  = new JMenuItem(detruireAction);
        JMenuItem fermerItem    = new JMenuItem(fermerAction);
        JMenuItem defaireItem   = new JMenuItem(defaireAction);
        JMenuItem refaireItem   = new JMenuItem(refaireAction);
        
        fichierMenu.add(fermerItem);
        editerMenu.add(defaireItem);
        editerMenu.add(refaireItem);
        editerMenu.add(voirItem);
        editerMenu.add(ajouterItem);
        editerMenu.add(editerItem);
        editerMenu.add(detruireItem);

        menuBar.add(fichierMenu);
        menuBar.add(editerMenu);

        /*
         *  Créer le JPanel qui affiche les informations de la fiche selectionnee
         */
		JPanel panelInfos = new JPanel();
		panelInfos.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		panelInfos.add(lblNom);
		
		txtNom = new JTextField();
		panelInfos.add(txtNom);
		txtNom.setColumns(N_CAR);
		txtNom.setEditable(false);
		
		JLabel lblPrenom = new JLabel("Prenom");
		panelInfos.add(lblPrenom);
		
		txtPrenom = new JTextField();
		panelInfos.add(txtPrenom);
		txtPrenom.setColumns(N_CAR);
		txtPrenom.setEditable(false);
		
		JLabel lblNumero = new JLabel("Numero");
		panelInfos.add(lblNumero);
		
		txtNumero = new JTextField();
		panelInfos.add(txtNumero);
		txtNumero.setColumns(N_CAR);
		txtNumero.setEditable(false);

		/*
		 * Créer la liste des fiches
		 */
		liste = new JList<Fiche>();
		liste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		liste.setVisibleRowCount(N_ITEM);
        JScrollPane listScrollPane = new JScrollPane(liste);

        // Le bottin est le model de la liste (bottin est un DefaultListModel)
		liste.setModel(bottin);

        // Fournir la strategie d'affichage d'une fiche a la liste
		liste.setCellRenderer(new FicheCelRenderer());
		
		// Ajouter cette vue comme listener lors d'une changement de sélection de la liste.
		// Ceci permet de mettre à jour les champs de la vue (nom, prenom et numero) 
		// et ajuster l'état des boutons lorsque la sélection de la liste est modifiée
		liste.addListSelectionListener(this);
		
		// Ajouter cette vue comme listener lors d'un changement à un item de la liste.
		// Ceci permet de mettre à jour les champs de la vue (nom, prenom et numéro) lorsqu'un
		// item de la fiche est modifiée (bouton Éditer).
		bottin.addListDataListener(this);
		
		/*
		 * Créer les boutons et associer les actions
		 */
		JPanel panelBoutons = new JPanel();
				
		JButton btnVoir = new JButton(voirAction);
		JButton btnAjouter = new JButton(ajouterAction);
		JButton btnEditer = new JButton(editerAction);
		JButton btnDetruire = new JButton(detruireAction);
		JButton btnFermer = new JButton(fermerAction);

		panelBoutons.add(btnVoir);
		panelBoutons.add(btnAjouter);		
		panelBoutons.add(btnEditer);
		panelBoutons.add(btnDetruire);
		panelBoutons.add(btnFermer);				

		/*
		 *  Créer la JPanel principal
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPane.add(panelInfos, BorderLayout.NORTH);
        contentPane.add(listScrollPane, BorderLayout.CENTER);
		contentPane.add(panelBoutons, BorderLayout.SOUTH);

		/*
		 * Initialiser les champs de la vue
		 */
		setTextFields(new Fiche());
		ficheSelectionne(false);
		
		/*
		 * Ajuster et affichier la vue (JFrame)
		 */
		setBounds(100, 100, 534, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(menuBar);
		add(contentPane);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	/**
	 * Activer ou déactiver les actions Voir, Editer et Detruire
	 * @param active - boolean, si true, les actions sont activees
	 */
	private void ficheSelectionne(boolean active) {
		voirAction.setEnabled(active);
		editerAction.setEnabled(active);
		detruireAction.setEnabled(active);
	}
		
	/**
	 * Mettre à jour les chamops Nom, Prénom et Numero de la vue à partir d'une fiche
	 * @param fiche - fiche utilisée pour mettre à jour les champs
	 */
	private void setTextFields(Fiche fiche) {
		txtNom.setText(fiche.getNom());
		txtPrenom.setText(fiche.getPrenom());
		txtNumero.setText(fiche.getNumero());
	}
	
	/**
	 * Retourne l'index de la ligne selectionnee du JList
	 * @return index de la ligne selectionnee
	 */
	public int getIndex() {
		return liste.getSelectedIndex();
	}
	
	
	/**
	 * Mettre à jour index et afficher les champs nom, prénom et numéro en conséquence
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
	    if (e.getValueIsAdjusting() == false) {
	    	int index = getIndex();
	    	if (index > -1) {
	    		ficheSelectionne(true);
				setTextFields(bottin.get(index));
	    	}
	    	else {
	    		ficheSelectionne(false);
	    		setTextFields(new Fiche());
	    	}		
	    }
	}

	@Override
	public void intervalAdded(ListDataEvent e) { }

	@Override
	public void intervalRemoved(ListDataEvent e) { }

	@Override
	public void contentsChanged(ListDataEvent e) {
		setTextFields(bottin.get(getIndex()));
	}
}
