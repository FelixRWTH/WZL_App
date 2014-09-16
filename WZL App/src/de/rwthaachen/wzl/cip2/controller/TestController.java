package de.rwthaachen.wzl.cip2.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.*;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import org.primefaces.component.inputtext.InputText;

import com.sun.faces.component.visit.FullVisitContext;
import com.sun.faces.taglib.html_basic.OutputTextTag;

@Named
@SessionScoped
public class TestController implements Serializable {
	private static final long serialVersionUID = 1L;
	private final static Logger logger = Logger.getLogger(TestController.class.getSimpleName());
	
	private HtmlForm deviceForm;
	private UIComponent deviceInput;
	private HtmlInputText inputText = new InputText();
	private HtmlOutputText outputText;
	
	private String deviceTime;
	private String stepName;
	private String inputType;
	
	private SimpleDateFormat format = new SimpleDateFormat("h:mm:ss a");
	
	 public void change(AjaxBehaviorEvent event) {
//		 deviceForm = (HtmlForm) findComponent("deviceForm");
//		 deviceInput = findComponent("deviceForm:deviceInput");
//		 
//		 
//		 HtmlSelectOneRadio component = (HtmlSelectOneRadio) event.getComponent();
//		 String id = component.getId();
//		 String value = (String) component.getValue();
//		 logger.info("change called by: " + id);
		 
//		 HtmlOutputText outputTextTime = new HtmlOutputText();
//		 outputTextTime.setValue(Calendar.getInstance().getTime());
//		 
//		 HtmlOutputText outputTextStepName = new HtmlOutputText();
//		 outputTextStepName.setValue(stepName);
//		 
		 
//         int size = deviceForm.getChildren().size();
//         
//         deviceForm.getChildren().remove(deviceInput);
//		 deviceForm.getChildren().add(outputTextTime);
//		 deviceForm.getChildren().add(outputTextStepName);

//		 if("textInput".equals(value)) {
//			 
//			 deviceForm.getChildren().add(new HtmlOutputText());
//			 logger.info("Changed to: " + id);
//		 } else if ("textAreaInput".equals(value)) {
//			 deviceForm.getChildren().add(new HtmlInputTextarea());
//			 
//			 
//			 logger.info("Changed to: " + id);
//			 
//		 }
	}
	 
	@PostConstruct
	public void init() {
		inputType = "textInput";
		stepName = "step  name";
		deviceTime = format.format(Calendar.getInstance().getTime());;
	}
	
	public UIComponent findComponent(final String id){
	    FacesContext context = FacesContext.getCurrentInstance(); 
	    UIViewRoot root = context.getViewRoot();
	    final UIComponent[] found = new UIComponent[1];
	    root.visitTree(new FullVisitContext(context), new VisitCallback() {     
	        @Override
	        public VisitResult visit(VisitContext context, UIComponent component) {
	            if(component.getId().equals(id)){
	                found[0] = component;
	                return VisitResult.COMPLETE;
	            }
	            return VisitResult.ACCEPT;              
	        }
	    });
	    return found[0];
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getDeviceTime() {
		deviceTime = format.format(Calendar.getInstance().getTime());
		return deviceTime;
	}

	public void setDeviceTime(String deviceTime) {
		this.deviceTime = deviceTime;
	}
	
	
	
}