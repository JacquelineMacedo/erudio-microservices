package br.com.erudio.controller;

import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.request.converters.NumberConverter.isNumeric;

@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();

    @GetMapping
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.sum(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne,
                                 @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.multiplication(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/divide/{numberOne}/{numberTwo}")
    public Double divide(@PathVariable("numberOne") String numberOne,
                         @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.division(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.subtraction(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable("numberOne") String numberOne,
                        @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.mean(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(@PathVariable("number") String number) throws Exception {
        if (!isNumeric(number)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }
}

