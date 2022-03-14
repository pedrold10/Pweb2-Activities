@Controller
@RequestMapping("/correntistas")
public class CorrentistaController {
    
    @RequestMapping("/form")
    public String getForm(Correntista correntista, Model model){
        model.addAttribute("correntista", correntista);
        return "correntistas/form";
    }
}
