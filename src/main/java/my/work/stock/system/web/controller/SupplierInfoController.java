package my.work.stock.system.web.controller;

import my.work.stock.system.domain.entity.SupplierInfo;
import my.work.stock.system.domain.service.SupplierInfoService;
import my.work.stock.system.web.view.SearchSupplierInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/supplierInfo")
public class SupplierInfoController {
    @Autowired
    private SupplierInfoService supplierInfoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView get(){
        Map<String, String> model = new HashMap<>();
        return new ModelAndView("basedatamanage/supplierinfo", model);
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public Page<SupplierInfo> page(SearchSupplierInfo searchSupplierInfo) {
        return supplierInfoService.searchSupplierInfo(searchSupplierInfo);
    }

    @RequestMapping(value = "export", method = RequestMethod.GET)
    public Boolean export() {
        return Boolean.TRUE;
    }
}
