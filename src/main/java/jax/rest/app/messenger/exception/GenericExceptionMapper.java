package jax.rest.app.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import jax.rest.app.messenger.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 
				500, "https://translate.yandex.ru/?lang=en-ru");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
												.entity(errorMessage)
												.build();
	}
}
