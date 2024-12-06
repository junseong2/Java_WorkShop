import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentDTO2;
import com.service.StudentService;
import com.service.StudentServiceImpl;



public class StudentMain {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		service.setDao(new StudentDAO());
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("********************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색 (예 > 2000부터 2003년까지");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄 수정");
			System.out.println("6. 학생 정원 일괄수정");
			System.out.println("7. 학생 학점 검색");
			System.out.println("8. 전체 학생 목록 - 페이징");
			System.out.println("0. 종료");
			System.out.println("********************************************");
			System.out.println("메뉴 입력 = >");
			String input_num = scan.next();
			
			if("1".equals(input_num)) {
				System.out.println("============================================================================");
				System.out.println("  학번		이름	  주민번호		    주소		입학년도	휴학여부");
				List<StudentDTO> list = service.findAll();
				for (StudentDTO StudentDTO : list) {
					System.out.println(StudentDTO);
				}
				System.out.println("총 학생수 : " + list.size() + " 명");

				
			}
			else if("2".equals(input_num)) {
				System.out.println("검색할 학생명을 입력하시오 = >");
				String STUDENT_NAME = scan.next();
				System.out.println("============================================================================");
				System.out.println("  학번		이름	  주민번호		    주소		입학년도	휴학여부");
				List<StudentDTO> list = service.findName(STUDENT_NAME);
				for (StudentDTO StudentDTO : list) {
					System.out.println(StudentDTO);
				}
				System.out.println("총 학생수 : " + list.size() + " 명");
				
			
			}else if("3".equals(input_num)) {
				System.out.println("시작 입학년도 입력하시오 => ");
		        int startYear = scan.nextInt();
		        System.out.println("끝 입학년도 입력하시오 => ");
		        int endYear = scan.nextInt();
				System.out.println("============================================================================");
				System.out.println("  학번		이름	  주민번호		    주소		입학년도	휴학여부");
				List<StudentDTO> list = service.findYear(startYear, endYear);
				for (StudentDTO student : list) {
		            System.out.println(student);
		        }
				System.out.println("총 학생수 : " + list.size() + " 명");
	
			
			}else if("4".equals(input_num)) {
				System.out.println("검색할 학생의 학번을 입력하시오 => ");
				String studentNo = scan.next();
		        String[] studentNoArray = studentNo.split(",");
		        List<String> studentNos = new ArrayList<>();
		        for (String studentNoss : studentNoArray) {
		            studentNos.add(studentNoss.trim());  
		        }
				System.out.println("============================================================================");
				System.out.println("  학번		이름	  주민번호		    주소		입학년도	휴학여부");
				List<StudentDTO> list = service.findNo(studentNos);
				for (StudentDTO student : list) {
		            System.out.println(student);
		        }
				System.out.println("총 학생수 : " + list.size() + " 명");

			
			}else if("5".equals(input_num)) {
				System.out.println("수정할 학생의 학번을 입력하시오 => ");
				String student_no = scan.next();
		        String[] studentNoArray = student_no.split(",");
		        List<String> studentNos = new ArrayList<>();
		        for (String studentNoss : studentNoArray) {
		            studentNos.add(studentNoss.trim());  
		        }
		        int n = service.updateabs(studentNos);
		        System.out.println("총 변경된 학생수 : " +n );

			
			}else if("6".equals(input_num)) {
				int n = service.updatecapa();
				System.out.println("총 변경된 학생수 "+n+ " 명" );
			
			
			}else if("7".equals(input_num)) {
				System.out.println("학생의 학번을 입력하시오 => ");
				String studentNo = scan.next();
			    String[] studentNoArray = studentNo.split(",");
			    List<String> studentNos = new ArrayList<>();
			    for (String studentNoss : studentNoArray) {
			        studentNos.add(studentNoss.trim());  
			    }
				System.out.println("============================================================================");
				System.out.println("  학기		학번	  이름		    과목명		점수	 학점");
				List<StudentDTO2> list = service.stugra(studentNos);
				for (StudentDTO2 student : list) {
			        System.out.println(student);
			    }
				
			
			}else if("8".equals(input_num)) {
				System.out.println("페이지당 보여줄 레코드 갯수를 입력하시오 = > ");
				int curPage = 1; 
				int perPage = scan.nextInt(); 
				int totalCount = service.getTotalCount();
				int totalPages = (int) Math.ceil((double) totalCount / perPage);
				while (true) {
				System.out.println("============================================================================");
				System.out.println("  학번		이름	  주민번호		    주소		입학년도	휴학여부");
				List<StudentDTO> list = service.paging(curPage, perPage);
				for (StudentDTO StudentDTO : list) {
					System.out.println(StudentDTO);
				}
				System.out.println( curPage + "/" + totalPages);
				System.out.println("N : 다음 페이지  B : 이전 페이지  Q : 메인화면");
					String input = scan.next();
	
				    if ("N".equalsIgnoreCase(input) && curPage < totalPages) {
				        curPage++;
				    } else if ("B".equalsIgnoreCase(input) && curPage > 1) {
				        curPage--;
				    } else if ("Q".equalsIgnoreCase(input)) {
				        System.out.println("메인 화면으로 돌아갑니다.");
				        break;
				    } else {
				    	System.out.println("똑바로 입력하세용");
				    }
				}
				
			
			}else {	
			    // 0. 종료
				scan.close();
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);  // 프로그램 종료
			
		        }
			}//end while
		
	}//end main
}//end class