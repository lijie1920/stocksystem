package my.work.stock.system.web.controller;

import my.work.stock.system.domain.entity.ComputerMaterialsInfo;
import my.work.stock.system.domain.service.ComputerMaterialsInfoService;
import my.work.stock.system.web.view.SearchComputerMaterialsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/computerMaterialsInfo")
public class ComputerMaterialsInfoController {
    @Autowired
    private ComputerMaterialsInfoService computerMaterialsInfoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView get() {
        Map<String, String> model = new HashMap<>();
        return new ModelAndView("basedatamanage/computermaterialsinfo", model);
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public Page<ComputerMaterialsInfo> page(SearchComputerMaterialsInfo searchComputerMaterialsInfo) {
        return computerMaterialsInfoService.searchComputerMaterialsInfo(searchComputerMaterialsInfo);
    }

    @RequestMapping(value = "export", method = RequestMethod.GET)
    public Boolean export() {
        return Boolean.TRUE;
    }
}
