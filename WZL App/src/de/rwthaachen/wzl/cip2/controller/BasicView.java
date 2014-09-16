package de.rwthaachen.wzl.cip2.controller;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;


@Named("treeBasicView")
@SessionScoped 
//@ManagedBean(name="treeBasicView")
//@ViewScoped
public class BasicView implements Serializable {
	private final static Logger logger = Logger.getLogger(BasicView.class.getSimpleName());  
    /**
	 * 
	 */
	private static final long serialVersionUID = -6172073926845475336L;
	private TreeNode root;
	private TreeNode selectedNode;
     
    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Node 0", root);
        TreeNode node1 = new DefaultTreeNode("Node 1", root);
         
        TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);
        TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);
         
        TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);
         
        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
        root.getChildren().add(new DefaultTreeNode("Node 2"));
        logger.info("BasicView.init() called");
    }
 
    public TreeNode getRoot() {
    	logger.info("BasicView.getRoot() called");
    	return root;
        
    }
    
    
    
    public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public void addNewNode(ActionEvent event) {
		logger.info("BasicView.addNewNode(ActionEvent even) called");
		new DefaultTreeNode("newNode", selectedNode);
    }
    
}