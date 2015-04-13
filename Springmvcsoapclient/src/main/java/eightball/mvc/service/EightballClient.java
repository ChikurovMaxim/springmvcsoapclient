package eightball.mvc.service;

import eightball.mvc.model.EightballDTO;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import eightball.mvc.model.EightBallRequest;
import eightball.mvc.model.EightBallResponse;


public class EightballClient extends WebServiceGatewaySupport {

	public EightballDTO getAnswer(EightballDTO question) {
		// TODO Auto-generated method stub
		EightBallRequest request = new EightBallRequest();
		request.setQuestion(question.getQuestion());
		
		EightBallResponse response =  (EightBallResponse) getWebServiceTemplate().marshalSendAndReceive(
				request,
				new SoapActionCallback("http://192.168.1.11:9090/v1/eightball/"));
		// Set the Answer attribute in our EightballDTO object used by the view's
		question.setAnswer(response.getAnswer());	
		return question;
	}

}
