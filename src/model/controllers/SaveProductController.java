package model.controllers;

/**
 * Created by rzzayed on 5/28/17.
 */
import model.Entities.User;
import model.Entities.UserForm;
import validator.UserValidator;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaveProductController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) {
        UserForm productForm = new UserForm();
        // populate action properties
        productForm.setName(request.getParameter("name"));


        // validate ProductForm
        UserValidator productValidator = new UserValidator();
        List<String> errors =
                productValidator.validate(productForm);
        if (errors.isEmpty()) {
            // create Product from ProductForm
            User product = new User();
            product.setName(productForm.getName());


            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("product", product);
            return "/WEB-INF/jsp/ProductDetails.jsp";
        } else {
            //store errors and form in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", productForm);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }
    }
}

