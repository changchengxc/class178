package selenium1012;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import selenium1012.priority.HighPriority;

@RunWith(Categories.class)
@Categories.IncludeCategory(HighPriority.class)
//@Categories.ExcludeCategory(HighPriority.class)
@Suite.SuiteClasses({AppTest.class, lalaTest.class})
public class HighPriorityTestCases {
}
