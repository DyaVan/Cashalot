package com.cashalot.web.ordinary.controller;

import com.cashalot.domain.appflow.Order;
import com.cashalot.dto.ConfirmationDTO;
import com.cashalot.repository.OrderRepository;
import com.cashalot.services.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/moderator")
public class ModeratorController {

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public String toOrders(Model model){

        model.addAttribute("orders",orderRepository.findByStatus(Order.PROCESSING_STATUS)) ;

        return "moderator/orders";
    }

    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.GET)
    public String toOrders(@ModelAttribute(name = "dto") ConfirmationDTO dto,
                           @PathVariable("id") Long id,
                           Model model){

        Order order = orderRepository.findOne(id);
        model.addAttribute("order", order);

        return "moderator/affirmation";
    }

    @Autowired
    AdService adService;

    @RequestMapping(value = "/orders/decide/{id}",method = RequestMethod.POST)
    public String affirm(@PathVariable("id") Long id,
                           Model model){

        Order order = orderRepository.findOne(id);

        adService.createAdvertisement(order);
        order.setStatus(Order.APPROVED_STATUS);
        orderRepository.save(order);

        return "moderator/affirmation";
    }


}
